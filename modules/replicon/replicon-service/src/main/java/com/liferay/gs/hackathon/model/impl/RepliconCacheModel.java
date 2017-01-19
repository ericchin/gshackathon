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

package com.liferay.gs.hackathon.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.gs.hackathon.model.Replicon;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Replicon in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see Replicon
 * @generated
 */
@ProviderType
public class RepliconCacheModel implements CacheModel<Replicon>, Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof RepliconCacheModel)) {
			return false;
		}

		RepliconCacheModel repliconCacheModel = (RepliconCacheModel)obj;

		if (projectId == repliconCacheModel.projectId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, projectId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(23);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", projectId=");
		sb.append(projectId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", userName=");
		sb.append(userName);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", projectName=");
		sb.append(projectName);
		sb.append(", startTime=");
		sb.append(startTime);
		sb.append(", endTime=");
		sb.append(endTime);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Replicon toEntityModel() {
		RepliconImpl repliconImpl = new RepliconImpl();

		if (uuid == null) {
			repliconImpl.setUuid(StringPool.BLANK);
		}
		else {
			repliconImpl.setUuid(uuid);
		}

		repliconImpl.setProjectId(projectId);
		repliconImpl.setGroupId(groupId);
		repliconImpl.setCompanyId(companyId);
		repliconImpl.setUserId(userId);

		if (userName == null) {
			repliconImpl.setUserName(StringPool.BLANK);
		}
		else {
			repliconImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			repliconImpl.setCreateDate(null);
		}
		else {
			repliconImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			repliconImpl.setModifiedDate(null);
		}
		else {
			repliconImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (projectName == null) {
			repliconImpl.setProjectName(StringPool.BLANK);
		}
		else {
			repliconImpl.setProjectName(projectName);
		}

		if (startTime == null) {
			repliconImpl.setStartTime(StringPool.BLANK);
		}
		else {
			repliconImpl.setStartTime(startTime);
		}

		if (endTime == null) {
			repliconImpl.setEndTime(StringPool.BLANK);
		}
		else {
			repliconImpl.setEndTime(endTime);
		}

		repliconImpl.resetOriginalValues();

		return repliconImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		projectId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		projectName = objectInput.readUTF();
		startTime = objectInput.readUTF();
		endTime = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(projectId);

		objectOutput.writeLong(groupId);

		objectOutput.writeLong(companyId);

		objectOutput.writeLong(userId);

		if (userName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(userName);
		}

		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);

		if (projectName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(projectName);
		}

		if (startTime == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(startTime);
		}

		if (endTime == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(endTime);
		}
	}

	public String uuid;
	public long projectId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String projectName;
	public String startTime;
	public String endTime;
}