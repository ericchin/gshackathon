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

package com.liferay.gs.hackathon.service.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.gs.hackathon.model.Replicon;
import com.liferay.gs.hackathon.service.base.RepliconServiceBaseImpl;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.service.ServiceContext;

import java.util.Date;

/**
 * The implementation of the replicon remote service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.liferay.gs.hackathon.service.RepliconService} interface.
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see RepliconServiceBaseImpl
 * @see com.liferay.gs.hackathon.service.RepliconServiceUtil
 */
@ProviderType
public class RepliconServiceImpl extends RepliconServiceBaseImpl {

	public Replicon addRepliconProject(JSONObject json) {
		return repliconLocalService.addRepliconProject(json);
	}

	/**
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link com.liferay.gs.hackathon.service.RepliconServiceUtil} to access the replicon remote service.
	 */

	public Replicon addRepliconProject(ServiceContext serviceContext) {
		return repliconLocalService.addRepliconProject(serviceContext);
	}

	public Replicon addRepliconProject(
		String projectName, Date startTime, Date endTime) {

		return repliconLocalService.addRepliconProject(
			projectName, startTime, endTime);
	}

	private static Log _log = LogFactoryUtil.getLog(RepliconServiceImpl.class);

}