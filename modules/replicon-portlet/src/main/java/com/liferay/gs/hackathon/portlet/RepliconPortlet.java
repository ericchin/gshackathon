package com.liferay.gs.hackathon.portlet;

import com.liferay.expando.kernel.model.ExpandoBridge;
import com.liferay.exportimport.kernel.lar.StagedModelType;
import com.liferay.gs.hackathon.model.Replicon;
import com.liferay.gs.hackathon.service.RepliconLocalService;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.service.ServiceContext;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
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

		List<Replicon> repliconEntries = repliconLocalService.getAllProjects();

		// get project names
		Set<String> projNames = repliconLocalService.getProjectNames();

		//repliconLocalService.getTotalHoursByProjectName();
		Map<String, Double>  projectsTotals = new HashMap<>();

		// populate total

		double absoluteTotal = 0.0;
		for (String pName : projNames) {
			double projTotal = repliconLocalService.getTotalHoursByProjectName(pName);
			projectsTotals.put(pName, projTotal);
			absoluteTotal += projTotal;
		}

		renderRequest.setAttribute(AVAIL_PROJS_ATTR, projectsTotals);
		renderRequest.setAttribute(TODAY_ATTR, new Date());
		renderRequest.setAttribute(REP_ENTRIES, repliconEntries);
		renderRequest.setAttribute(ABSOL_TOTAL, absoluteTotal);

		super.doView(renderRequest, renderResponse);
	}

	private void addTotal (Map <String, Double> totalValues, String proj, double hours) {
		if (totalValues.containsKey(proj)){
			double curVal = totalValues.get(proj);
			totalValues.replace(proj, curVal + hours);
		}
	}

	private @Reference
	RepliconLocalService repliconLocalService;


	private static class MyRepliconImpl implements Replicon {
		// TODO REMOVE

		private String projectName, bill, act;
		private Date start, end;

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
			return projectName;
		}

		@Override
		public void setProjectName(String projectName) {
			this.projectName = projectName;
		}

		@Override
		public Date getStartTime() {
			return start;
		}

		@Override
		public void setStartTime(Date startTime) {
			start = startTime;
		}


		@Override
		public Date getEndTime() {
			return end;
		}

		@Override
		public void setEndTime(Date endTime) {
			end = endTime;
		}

		@Override
		public String getBilling() {
			return bill;
		}

		@Override
		public void setBilling(String billing) {
			bill = billing;
		}

		@Override
		public String getActivity() {
			return act;
		}

		@Override
		public void setActivity(String activity) {
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

		@Override
		public double getTotalTimeInHours() {
			double t = getEndTime().getTime() - getStartTime().getTime();
			t /= 3600000.0;
			return t;
		}
	}//TODO END REMOVE
}