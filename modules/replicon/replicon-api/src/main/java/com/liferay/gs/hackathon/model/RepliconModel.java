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

package com.liferay.gs.hackathon.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.expando.kernel.model.ExpandoBridge;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.GroupedModel;
import com.liferay.portal.kernel.model.ShardedModel;
import com.liferay.portal.kernel.model.StagedAuditedModel;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the Replicon service. Represents a row in the &quot;GS_Replicon&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.liferay.gs.hackathon.model.impl.RepliconModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.liferay.gs.hackathon.model.impl.RepliconImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Replicon
 * @see com.liferay.gs.hackathon.model.impl.RepliconImpl
 * @see com.liferay.gs.hackathon.model.impl.RepliconModelImpl
 * @generated
 */
@ProviderType
public interface RepliconModel extends BaseModel<Replicon>, GroupedModel,
	ShardedModel, StagedAuditedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a replicon model instance should use the {@link Replicon} interface instead.
	 */

	/**
	 * Returns the primary key of this replicon.
	 *
	 * @return the primary key of this replicon
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this replicon.
	 *
	 * @param primaryKey the primary key of this replicon
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the uuid of this replicon.
	 *
	 * @return the uuid of this replicon
	 */
	@AutoEscape
	@Override
	public String getUuid();

	/**
	 * Sets the uuid of this replicon.
	 *
	 * @param uuid the uuid of this replicon
	 */
	@Override
	public void setUuid(String uuid);

	/**
	 * Returns the project ID of this replicon.
	 *
	 * @return the project ID of this replicon
	 */
	public long getProjectId();

	/**
	 * Sets the project ID of this replicon.
	 *
	 * @param projectId the project ID of this replicon
	 */
	public void setProjectId(long projectId);

	/**
	 * Returns the group ID of this replicon.
	 *
	 * @return the group ID of this replicon
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this replicon.
	 *
	 * @param groupId the group ID of this replicon
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this replicon.
	 *
	 * @return the company ID of this replicon
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this replicon.
	 *
	 * @param companyId the company ID of this replicon
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this replicon.
	 *
	 * @return the user ID of this replicon
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this replicon.
	 *
	 * @param userId the user ID of this replicon
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this replicon.
	 *
	 * @return the user uuid of this replicon
	 */
	@Override
	public String getUserUuid();

	/**
	 * Sets the user uuid of this replicon.
	 *
	 * @param userUuid the user uuid of this replicon
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this replicon.
	 *
	 * @return the user name of this replicon
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this replicon.
	 *
	 * @param userName the user name of this replicon
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this replicon.
	 *
	 * @return the create date of this replicon
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this replicon.
	 *
	 * @param createDate the create date of this replicon
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this replicon.
	 *
	 * @return the modified date of this replicon
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this replicon.
	 *
	 * @param modifiedDate the modified date of this replicon
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the project name of this replicon.
	 *
	 * @return the project name of this replicon
	 */
	@AutoEscape
	public String getProjectName();

	/**
	 * Sets the project name of this replicon.
	 *
	 * @param projectName the project name of this replicon
	 */
	public void setProjectName(String projectName);

	/**
	 * Returns the start time of this replicon.
	 *
	 * @return the start time of this replicon
	 */
	public Date getStartTime();

	/**
	 * Sets the start time of this replicon.
	 *
	 * @param startTime the start time of this replicon
	 */
	public void setStartTime(Date startTime);

	/**
	 * Returns the end time of this replicon.
	 *
	 * @return the end time of this replicon
	 */
	public Date getEndTime();

	/**
	 * Sets the end time of this replicon.
	 *
	 * @param endTime the end time of this replicon
	 */
	public void setEndTime(Date endTime);

	/**
	 * Returns the billing of this replicon.
	 *
	 * @return the billing of this replicon
	 */
	@AutoEscape
	public String getBilling();

	/**
	 * Sets the billing of this replicon.
	 *
	 * @param billing the billing of this replicon
	 */
	public void setBilling(String billing);

	/**
	 * Returns the activity of this replicon.
	 *
	 * @return the activity of this replicon
	 */
	@AutoEscape
	public String getActivity();

	/**
	 * Sets the activity of this replicon.
	 *
	 * @param activity the activity of this replicon
	 */
	public void setActivity(String activity);

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(Replicon replicon);

	@Override
	public int hashCode();

	@Override
	public CacheModel<Replicon> toCacheModel();

	@Override
	public Replicon toEscapedModel();

	@Override
	public Replicon toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}