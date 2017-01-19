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

import com.liferay.osgi.util.ServiceTrackerFactory;

import org.osgi.util.tracker.ServiceTracker;

/**
 * Provides the remote service utility for Replicon. This utility wraps
 * {@link com.liferay.gs.hackathon.service.impl.RepliconServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on a remote server. Methods of this service are expected to have security
 * checks based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author Brian Wing Shun Chan
 * @see RepliconService
 * @see com.liferay.gs.hackathon.service.base.RepliconServiceBaseImpl
 * @see com.liferay.gs.hackathon.service.impl.RepliconServiceImpl
 * @generated
 */
@ProviderType
public class RepliconServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.liferay.gs.hackathon.service.impl.RepliconServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */
	public static com.liferay.gs.hackathon.model.Replicon addRepliconProject(
		com.liferay.portal.kernel.json.JSONObject json) {
		return getService().addRepliconProject(json);
	}

	/**
	* NOTE FOR DEVELOPERS:
	*
	* Never reference this class directly. Always use {@link RepliconServiceUtil} to access the replicon remote service.
	*/
	public static com.liferay.gs.hackathon.model.Replicon addRepliconProject(
		com.liferay.portal.kernel.service.ServiceContext serviceContext) {
		return getService().addRepliconProject(serviceContext);
	}

	public static com.liferay.gs.hackathon.model.Replicon addRepliconProject(
		java.lang.String projectName, java.util.Date startTime,
		java.util.Date endTime) {
		return getService().addRepliconProject(projectName, startTime, endTime);
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	public static java.lang.String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	public static RepliconService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<RepliconService, RepliconService> _serviceTracker =
		ServiceTrackerFactory.open(RepliconService.class);
}