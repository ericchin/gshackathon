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

import com.liferay.exportimport.kernel.lar.StagedModelType;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * <p>
 * This class is a wrapper for {@link Replicon}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Replicon
 * @generated
 */
@ProviderType
public class RepliconWrapper implements Replicon, ModelWrapper<Replicon> {
	public RepliconWrapper(Replicon replicon) {
		_replicon = replicon;
	}

	@Override
	public Class<?> getModelClass() {
		return Replicon.class;
	}

	@Override
	public String getModelClassName() {
		return Replicon.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("projectId", getProjectId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("startTime", getStartTime());
		attributes.put("endTime", getEndTime());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long projectId = (Long)attributes.get("projectId");

		if (projectId != null) {
			setProjectId(projectId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		Date startTime = (Date)attributes.get("startTime");

		if (startTime != null) {
			setStartTime(startTime);
		}

		Date endTime = (Date)attributes.get("endTime");

		if (endTime != null) {
			setEndTime(endTime);
		}
	}

	@Override
	public Replicon toEscapedModel() {
		return new RepliconWrapper(_replicon.toEscapedModel());
	}

	@Override
	public Replicon toUnescapedModel() {
		return new RepliconWrapper(_replicon.toUnescapedModel());
	}

	@Override
	public boolean isCachedModel() {
		return _replicon.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _replicon.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _replicon.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _replicon.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<Replicon> toCacheModel() {
		return _replicon.toCacheModel();
	}

	@Override
	public int compareTo(Replicon replicon) {
		return _replicon.compareTo(replicon);
	}

	@Override
	public int hashCode() {
		return _replicon.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _replicon.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new RepliconWrapper((Replicon)_replicon.clone());
	}

	/**
	* Returns the user name of this replicon.
	*
	* @return the user name of this replicon
	*/
	@Override
	public java.lang.String getUserName() {
		return _replicon.getUserName();
	}

	/**
	* Returns the user uuid of this replicon.
	*
	* @return the user uuid of this replicon
	*/
	@Override
	public java.lang.String getUserUuid() {
		return _replicon.getUserUuid();
	}

	/**
	* Returns the uuid of this replicon.
	*
	* @return the uuid of this replicon
	*/
	@Override
	public java.lang.String getUuid() {
		return _replicon.getUuid();
	}

	@Override
	public java.lang.String toString() {
		return _replicon.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _replicon.toXmlString();
	}

	/**
	* Returns the create date of this replicon.
	*
	* @return the create date of this replicon
	*/
	@Override
	public Date getCreateDate() {
		return _replicon.getCreateDate();
	}

	/**
	* Returns the end time of this replicon.
	*
	* @return the end time of this replicon
	*/
	@Override
	public Date getEndTime() {
		return _replicon.getEndTime();
	}

	/**
	* Returns the modified date of this replicon.
	*
	* @return the modified date of this replicon
	*/
	@Override
	public Date getModifiedDate() {
		return _replicon.getModifiedDate();
	}

	/**
	* Returns the start time of this replicon.
	*
	* @return the start time of this replicon
	*/
	@Override
	public Date getStartTime() {
		return _replicon.getStartTime();
	}

	/**
	* Returns the company ID of this replicon.
	*
	* @return the company ID of this replicon
	*/
	@Override
	public long getCompanyId() {
		return _replicon.getCompanyId();
	}

	/**
	* Returns the group ID of this replicon.
	*
	* @return the group ID of this replicon
	*/
	@Override
	public long getGroupId() {
		return _replicon.getGroupId();
	}

	/**
	* Returns the primary key of this replicon.
	*
	* @return the primary key of this replicon
	*/
	@Override
	public long getPrimaryKey() {
		return _replicon.getPrimaryKey();
	}

	/**
	* Returns the project ID of this replicon.
	*
	* @return the project ID of this replicon
	*/
	@Override
	public long getProjectId() {
		return _replicon.getProjectId();
	}

	/**
	* Returns the user ID of this replicon.
	*
	* @return the user ID of this replicon
	*/
	@Override
	public long getUserId() {
		return _replicon.getUserId();
	}

	@Override
	public void persist() {
		_replicon.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_replicon.setCachedModel(cachedModel);
	}

	/**
	* Sets the company ID of this replicon.
	*
	* @param companyId the company ID of this replicon
	*/
	@Override
	public void setCompanyId(long companyId) {
		_replicon.setCompanyId(companyId);
	}

	/**
	* Sets the create date of this replicon.
	*
	* @param createDate the create date of this replicon
	*/
	@Override
	public void setCreateDate(Date createDate) {
		_replicon.setCreateDate(createDate);
	}

	/**
	* Sets the end time of this replicon.
	*
	* @param endTime the end time of this replicon
	*/
	@Override
	public void setEndTime(Date endTime) {
		_replicon.setEndTime(endTime);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_replicon.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_replicon.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_replicon.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the group ID of this replicon.
	*
	* @param groupId the group ID of this replicon
	*/
	@Override
	public void setGroupId(long groupId) {
		_replicon.setGroupId(groupId);
	}

	/**
	* Sets the modified date of this replicon.
	*
	* @param modifiedDate the modified date of this replicon
	*/
	@Override
	public void setModifiedDate(Date modifiedDate) {
		_replicon.setModifiedDate(modifiedDate);
	}

	@Override
	public void setNew(boolean n) {
		_replicon.setNew(n);
	}

	/**
	* Sets the primary key of this replicon.
	*
	* @param primaryKey the primary key of this replicon
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_replicon.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_replicon.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the project ID of this replicon.
	*
	* @param projectId the project ID of this replicon
	*/
	@Override
	public void setProjectId(long projectId) {
		_replicon.setProjectId(projectId);
	}

	/**
	* Sets the start time of this replicon.
	*
	* @param startTime the start time of this replicon
	*/
	@Override
	public void setStartTime(Date startTime) {
		_replicon.setStartTime(startTime);
	}

	/**
	* Sets the user ID of this replicon.
	*
	* @param userId the user ID of this replicon
	*/
	@Override
	public void setUserId(long userId) {
		_replicon.setUserId(userId);
	}

	/**
	* Sets the user name of this replicon.
	*
	* @param userName the user name of this replicon
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_replicon.setUserName(userName);
	}

	/**
	* Sets the user uuid of this replicon.
	*
	* @param userUuid the user uuid of this replicon
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_replicon.setUserUuid(userUuid);
	}

	/**
	* Sets the uuid of this replicon.
	*
	* @param uuid the uuid of this replicon
	*/
	@Override
	public void setUuid(java.lang.String uuid) {
		_replicon.setUuid(uuid);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof RepliconWrapper)) {
			return false;
		}

		RepliconWrapper repliconWrapper = (RepliconWrapper)obj;

		if (Objects.equals(_replicon, repliconWrapper._replicon)) {
			return true;
		}

		return false;
	}

	@Override
	public StagedModelType getStagedModelType() {
		return _replicon.getStagedModelType();
	}

	@Override
	public Replicon getWrappedModel() {
		return _replicon;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _replicon.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _replicon.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_replicon.resetOriginalValues();
	}

	private final Replicon _replicon;
}