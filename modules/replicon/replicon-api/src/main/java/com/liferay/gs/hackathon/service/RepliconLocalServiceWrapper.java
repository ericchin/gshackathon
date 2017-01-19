/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.gs.hackathon.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link RepliconLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see RepliconLocalService
 * @generated
 */
@ProviderType
public class RepliconLocalServiceWrapper implements RepliconLocalService,
	ServiceWrapper<RepliconLocalService> {
	public RepliconLocalServiceWrapper(
		RepliconLocalService repliconLocalService) {
		_repliconLocalService = repliconLocalService;
	}

	/**
	* Adds the replicon to the database. Also notifies the appropriate model listeners.
	*
	* @param replicon the replicon
	* @return the replicon that was added
	*/
	@Override
	public com.liferay.gs.hackathon.model.Replicon addReplicon(
		com.liferay.gs.hackathon.model.Replicon replicon) {
		return _repliconLocalService.addReplicon(replicon);
	}

	@Override
	public com.liferay.gs.hackathon.model.Replicon addRepliconProject(
		com.liferay.portal.kernel.json.JSONObject json) {
		return _repliconLocalService.addRepliconProject(json);
	}

	@Override
	public com.liferay.gs.hackathon.model.Replicon addRepliconProject(
		com.liferay.portal.kernel.service.ServiceContext serviceContext) {
		return _repliconLocalService.addRepliconProject(serviceContext);
	}

	@Override
	public com.liferay.gs.hackathon.model.Replicon addRepliconProject(
		java.lang.String projectName, java.lang.String startTime,
		java.lang.String endTime) {
		return _repliconLocalService.addRepliconProject(projectName, startTime,
			endTime);
	}

	@Override
	public com.liferay.gs.hackathon.model.Replicon addRepliconProject(
		java.lang.String startTime, java.lang.String endTime,
		java.lang.String projectName,
		com.liferay.portal.kernel.service.ServiceContext serviceContext) {
		return _repliconLocalService.addRepliconProject(startTime, endTime,
			projectName, serviceContext);
	}

	/**
	* Creates a new replicon with the primary key. Does not add the replicon to the database.
	*
	* @param projectId the primary key for the new replicon
	* @return the new replicon
	*/
	@Override
	public com.liferay.gs.hackathon.model.Replicon createReplicon(
		long projectId) {
		return _repliconLocalService.createReplicon(projectId);
	}

	/**
	* Deletes the replicon from the database. Also notifies the appropriate model listeners.
	*
	* @param replicon the replicon
	* @return the replicon that was removed
	*/
	@Override
	public com.liferay.gs.hackathon.model.Replicon deleteReplicon(
		com.liferay.gs.hackathon.model.Replicon replicon) {
		return _repliconLocalService.deleteReplicon(replicon);
	}

	/**
	* Deletes the replicon with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param projectId the primary key of the replicon
	* @return the replicon that was removed
	* @throws PortalException if a replicon with the primary key could not be found
	*/
	@Override
	public com.liferay.gs.hackathon.model.Replicon deleteReplicon(
		long projectId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _repliconLocalService.deleteReplicon(projectId);
	}

	@Override
	public com.liferay.gs.hackathon.model.Replicon fetchReplicon(long projectId) {
		return _repliconLocalService.fetchReplicon(projectId);
	}

	/**
	* Returns the replicon matching the UUID and group.
	*
	* @param uuid the replicon's UUID
	* @param groupId the primary key of the group
	* @return the matching replicon, or <code>null</code> if a matching replicon could not be found
	*/
	@Override
	public com.liferay.gs.hackathon.model.Replicon fetchRepliconByUuidAndGroupId(
		java.lang.String uuid, long groupId) {
		return _repliconLocalService.fetchRepliconByUuidAndGroupId(uuid, groupId);
	}

	/**
	* Returns the replicon with the primary key.
	*
	* @param projectId the primary key of the replicon
	* @return the replicon
	* @throws PortalException if a replicon with the primary key could not be found
	*/
	@Override
	public com.liferay.gs.hackathon.model.Replicon getReplicon(long projectId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _repliconLocalService.getReplicon(projectId);
	}

	/**
	* Returns the replicon matching the UUID and group.
	*
	* @param uuid the replicon's UUID
	* @param groupId the primary key of the group
	* @return the matching replicon
	* @throws PortalException if a matching replicon could not be found
	*/
	@Override
	public com.liferay.gs.hackathon.model.Replicon getRepliconByUuidAndGroupId(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _repliconLocalService.getRepliconByUuidAndGroupId(uuid, groupId);
	}

	/**
	* Updates the replicon in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param replicon the replicon
	* @return the replicon that was updated
	*/
	@Override
	public com.liferay.gs.hackathon.model.Replicon updateReplicon(
		com.liferay.gs.hackathon.model.Replicon replicon) {
		return _repliconLocalService.updateReplicon(replicon);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _repliconLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _repliconLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery getExportActionableDynamicQuery(
		com.liferay.exportimport.kernel.lar.PortletDataContext portletDataContext) {
		return _repliconLocalService.getExportActionableDynamicQuery(portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _repliconLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _repliconLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _repliconLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of replicons.
	*
	* @return the number of replicons
	*/
	@Override
	public int getRepliconsCount() {
		return _repliconLocalService.getRepliconsCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _repliconLocalService.getOSGiServiceIdentifier();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return _repliconLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.gs.hackathon.model.impl.RepliconModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {
		return _repliconLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.gs.hackathon.model.impl.RepliconModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {
		return _repliconLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	@Override
	public java.util.List<com.liferay.gs.hackathon.model.Replicon> getAllProjects() {
		return _repliconLocalService.getAllProjects();
	}

	/**
	* Returns a range of all the replicons.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.gs.hackathon.model.impl.RepliconModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of replicons
	* @param end the upper bound of the range of replicons (not inclusive)
	* @return the range of replicons
	*/
	@Override
	public java.util.List<com.liferay.gs.hackathon.model.Replicon> getReplicons(
		int start, int end) {
		return _repliconLocalService.getReplicons(start, end);
	}

	/**
	* Returns all the replicons matching the UUID and company.
	*
	* @param uuid the UUID of the replicons
	* @param companyId the primary key of the company
	* @return the matching replicons, or an empty list if no matches were found
	*/
	@Override
	public java.util.List<com.liferay.gs.hackathon.model.Replicon> getRepliconsByUuidAndCompanyId(
		java.lang.String uuid, long companyId) {
		return _repliconLocalService.getRepliconsByUuidAndCompanyId(uuid,
			companyId);
	}

	/**
	* Returns a range of replicons matching the UUID and company.
	*
	* @param uuid the UUID of the replicons
	* @param companyId the primary key of the company
	* @param start the lower bound of the range of replicons
	* @param end the upper bound of the range of replicons (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the range of matching replicons, or an empty list if no matches were found
	*/
	@Override
	public java.util.List<com.liferay.gs.hackathon.model.Replicon> getRepliconsByUuidAndCompanyId(
		java.lang.String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<com.liferay.gs.hackathon.model.Replicon> orderByComparator) {
		return _repliconLocalService.getRepliconsByUuidAndCompanyId(uuid,
			companyId, start, end, orderByComparator);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows matching the dynamic query
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return _repliconLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows matching the dynamic query
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {
		return _repliconLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public RepliconLocalService getWrappedService() {
		return _repliconLocalService;
	}

	@Override
	public void setWrappedService(RepliconLocalService repliconLocalService) {
		_repliconLocalService = repliconLocalService;
	}

	private RepliconLocalService _repliconLocalService;
}