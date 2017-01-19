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
import com.liferay.gs.hackathon.service.base.RepliconLocalServiceBaseImpl;
import com.liferay.gs.hackathon.util.RepliconConstants;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.StringPool;

import java.util.Date;

/**
 * The implementation of the replicon local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.liferay.gs.hackathon.service.RepliconLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see RepliconLocalServiceBaseImpl
 * @see com.liferay.gs.hackathon.service.RepliconLocalServiceUtil
 */
@ProviderType
public class RepliconLocalServiceImpl extends RepliconLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link com.liferay.gs.hackathon.service.RepliconLocalServiceUtil} to access the replicon local service.
	 */

	public Replicon addRepliconProject(ServiceContext serviceContext) {
		long projectId = counterLocalService.increment(
			Replicon.class.getName());

		Replicon replicon = repliconPersistence.create(projectId);

		long userId = serviceContext.getUserId();

		String userName = StringPool.BLANK;

		User user = userLocalService.fetchUser(userId);

		if (user != null) {
			userName = user.getScreenName();
		}

		String projectName = (String) serviceContext.getAttribute(
			RepliconConstants.PROJECT_NAME);

		String startTime = (String) serviceContext.getAttribute(
			RepliconConstants.START_TIME);

		String endTime = (String) serviceContext.getAttribute(
			RepliconConstants.END_TIME);

		replicon.setGroupId(serviceContext.getScopeGroupId());
		replicon.setCompanyId(serviceContext.getCompanyId());
		replicon.setUserId(serviceContext.getUserId());
		replicon.setUserName(userName);
		replicon.setCreateDate(new Date());
		replicon.setModifiedDate(new Date());

		replicon.setProjectName(projectName);
		replicon.setStartTime(startTime);
		replicon.setEndTime(endTime);

		return repliconPersistence.update(replicon);
	}

}