package com.liferay.gs.hackathon.portlet;

import com.liferay.expando.kernel.model.ExpandoBridge;
import com.liferay.exportimport.kernel.lar.StagedModelType;
import com.liferay.gs.hackathon.model.Replicon;
import com.liferay.gs.hackathon.service.RepliconLocalService;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;

import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import com.liferay.portal.kernel.service.ServiceContext;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import java.io.IOException;
import java.io.Serializable;
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

		List<Replicon> repliconEntries = new ArrayList<>();
		{ //TODO REMOVE
			int myCount = 3;
			while (myCount-- > 0) {
				Replicon curReplicon = new MyRepliconImpl();
				curReplicon.setProjectName("My Random Project " + myCount);
				curReplicon.setStartTime("--Start Time--");
				curReplicon.setEndTime("--Start Time--");
				repliconEntries.add(curReplicon);
			}
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
		renderRequest.setAttribute(REP_ENTRIES, repliconEntries);

		super.doView(renderRequest, renderResponse);
	}

	private @Reference
	RepliconLocalService repliconLocalService;


	private static class MyRepliconImpl implements Replicon {
		// TODO REMOVE

		@Override
		public long getPrimaryKey() {
			return 0;
		}

		@Override
		public void setPrimaryKey(long primaryKey) {

		}

		@Override
		public String getUuid() {
			return null;
		}

		@Override
		public void setUuid(String uuid) {

		}

		@Override
		public long getProjectId() {
			return 0;
		}

		@Override
		public void setProjectId(long projectId) {

		}

		@Override
		public long getGroupId() {
			return 0;
		}

		@Override
		public void setGroupId(long groupId) {

		}

		@Override
		public long getCompanyId() {
			return 0;
		}

		@Override
		public void setCompanyId(long companyId) {

		}

		@Override
		public long getUserId() {
			return 0;
		}

		@Override
		public void setUserId(long userId) {

		}

		@Override
		public String getUserUuid() {
			return null;
		}

		@Override
		public void setUserUuid(String userUuid) {

		}

		@Override
		public String getUserName() {
			return null;
		}

		@Override
		public void setUserName(String userName) {

		}

		@Override
		public Date getCreateDate() {
			return null;
		}

		@Override
		public void setCreateDate(Date createDate) {

		}

		@Override
		public Date getModifiedDate() {
			return null;
		}

		@Override
		public StagedModelType getStagedModelType() {
			return null;
		}

		@Override
		public void setModifiedDate(Date modifiedDate) {

		}

		@Override
		public String getProjectName() {
			return null;
		}

		@Override
		public void setProjectName(String projectName) {

		}

		@Override
		public String getStartTime() {
			return null;
		}

		@Override
		public void setStartTime(String startTime) {

		}

		@Override
		public String getEndTime() {
			return null;
		}

		@Override
		public void setEndTime(String endTime) {

		}

		@Override
		public boolean isNew() {
			return false;
		}

		@Override
		public void resetOriginalValues() {

		}

		@Override
		public void setNew(boolean n) {

		}

		@Override
		public boolean isCachedModel() {
			return false;
		}

		@Override
		public boolean isEntityCacheEnabled() {
			return false;
		}

		@Override
		public void setCachedModel(boolean cachedModel) {

		}

		@Override
		public boolean isEscapedModel() {
			return false;
		}

		@Override
		public boolean isFinderCacheEnabled() {
			return false;
		}

		@Override
		public Serializable getPrimaryKeyObj() {
			return null;
		}

		@Override
		public void setPrimaryKeyObj(Serializable primaryKeyObj) {

		}

		@Override
		public ExpandoBridge getExpandoBridge() {
			return null;
		}

		@Override
		public Class<?> getModelClass() {
			return null;
		}

		@Override
		public String getModelClassName() {
			return null;
		}

		@Override
		public Map<String, Object> getModelAttributes() {
			return null;
		}

		@Override
		public void setExpandoBridgeAttributes(BaseModel<?> baseModel) {

		}

		@Override
		public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {

		}

		@Override
		public void setExpandoBridgeAttributes(ServiceContext serviceContext) {

		}

		@Override
		public Object clone() {
			return null;
		}

		@Override
		public void setModelAttributes(Map<String, Object> attributes) {

		}

		@Override
		public int compareTo(Replicon replicon) {
			return 0;
		}

		@Override
		public CacheModel<Replicon> toCacheModel() {
			return null;
		}

		@Override
		public Replicon toEscapedModel() {
			return null;
		}

		@Override
		public Replicon toUnescapedModel() {
			return null;
		}

		@Override
		public String toXmlString() {
			return null;
		}

		@Override
		public void persist() {

		}
	}//TODO END REMOVE
}