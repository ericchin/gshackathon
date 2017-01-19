package com.liferay.gs.hackathon.portlet;

import com.liferay.gs.hackathon.service.RepliconLocalService;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;

import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import java.io.IOException;
import java.util.*;

import static com.liferay.gs.hackathon.portlet.constants.RepliconConstants.*;

@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=category.sample",
		"com.liferay.portlet.instanceable=true",
		"com.liferay.portlet.header-portlet-css=/main.css",
		"javax.portlet.display-name=Replicon",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class RepliconPortlet extends MVCPortlet {


	@Override
	public void doView(RenderRequest renderRequest, RenderResponse renderResponse) throws IOException, PortletException {

		try {
			repliconLocalService.getReplicon(0);
		} catch (PortalException e) {
			e.printStackTrace();
		}

		List<String> projects = new ArrayList<>();

		// TODO Replace Sample Data
		projects.add("Some Project 1");
		projects.add("Some Project 2");

		Map<String, Map<String, List<String>>> availableBillingAndActivity = new HashMap<>();

		// TODO Replace Sample data
		for (String proj: projects){
			Map<String, List<String>> newBillActMap = new HashMap<>();
			List<String> sampleBillOptions = new ArrayList<>();
			sampleBillOptions.add("SampleBillOption 1");
			sampleBillOptions.add("SampleBillOption 2");
			List<String> sampleActivityOptions = new ArrayList<>();
			sampleActivityOptions .add("SampleActOption 1");
			sampleActivityOptions .add("SampleActOption 2");
			newBillActMap.put("billings", sampleBillOptions);
			newBillActMap.put("activities", sampleActivityOptions);
			availableBillingAndActivity.put(proj, newBillActMap);
		}

		renderRequest.setAttribute(AVAIL_PROJS_ATTR, projects);
		renderRequest.setAttribute(TODAY_ATTR, new Date());

		super.doView(renderRequest, renderResponse);
	}

	private @Reference
	RepliconLocalService repliconLocalService;
}