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

package com.liferay.gs.hackathon.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.gs.hackathon.exception.NoSuchRepliconException;
import com.liferay.gs.hackathon.model.Replicon;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * The persistence interface for the replicon service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.liferay.gs.hackathon.service.persistence.impl.RepliconPersistenceImpl
 * @see RepliconUtil
 * @generated
 */
@ProviderType
public interface RepliconPersistence extends BasePersistence<Replicon> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link RepliconUtil} to access the replicon persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the replicons where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching replicons
	*/
	public java.util.List<Replicon> findByUuid(java.lang.String uuid);

	/**
	* Returns a range of all the replicons where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link RepliconModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of replicons
	* @param end the upper bound of the range of replicons (not inclusive)
	* @return the range of matching replicons
	*/
	public java.util.List<Replicon> findByUuid(java.lang.String uuid,
		int start, int end);

	/**
	* Returns an ordered range of all the replicons where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link RepliconModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of replicons
	* @param end the upper bound of the range of replicons (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching replicons
	*/
	public java.util.List<Replicon> findByUuid(java.lang.String uuid,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Replicon> orderByComparator);

	/**
	* Returns an ordered range of all the replicons where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link RepliconModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of replicons
	* @param end the upper bound of the range of replicons (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching replicons
	*/
	public java.util.List<Replicon> findByUuid(java.lang.String uuid,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Replicon> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first replicon in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching replicon
	* @throws NoSuchRepliconException if a matching replicon could not be found
	*/
	public Replicon findByUuid_First(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Replicon> orderByComparator)
		throws NoSuchRepliconException;

	/**
	* Returns the first replicon in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching replicon, or <code>null</code> if a matching replicon could not be found
	*/
	public Replicon fetchByUuid_First(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Replicon> orderByComparator);

	/**
	* Returns the last replicon in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching replicon
	* @throws NoSuchRepliconException if a matching replicon could not be found
	*/
	public Replicon findByUuid_Last(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Replicon> orderByComparator)
		throws NoSuchRepliconException;

	/**
	* Returns the last replicon in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching replicon, or <code>null</code> if a matching replicon could not be found
	*/
	public Replicon fetchByUuid_Last(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Replicon> orderByComparator);

	/**
	* Returns the replicons before and after the current replicon in the ordered set where uuid = &#63;.
	*
	* @param projectId the primary key of the current replicon
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next replicon
	* @throws NoSuchRepliconException if a replicon with the primary key could not be found
	*/
	public Replicon[] findByUuid_PrevAndNext(long projectId,
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Replicon> orderByComparator)
		throws NoSuchRepliconException;

	/**
	* Removes all the replicons where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	*/
	public void removeByUuid(java.lang.String uuid);

	/**
	* Returns the number of replicons where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching replicons
	*/
	public int countByUuid(java.lang.String uuid);

	/**
	* Returns the replicon where uuid = &#63; and groupId = &#63; or throws a {@link NoSuchRepliconException} if it could not be found.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching replicon
	* @throws NoSuchRepliconException if a matching replicon could not be found
	*/
	public Replicon findByUUID_G(java.lang.String uuid, long groupId)
		throws NoSuchRepliconException;

	/**
	* Returns the replicon where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching replicon, or <code>null</code> if a matching replicon could not be found
	*/
	public Replicon fetchByUUID_G(java.lang.String uuid, long groupId);

	/**
	* Returns the replicon where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching replicon, or <code>null</code> if a matching replicon could not be found
	*/
	public Replicon fetchByUUID_G(java.lang.String uuid, long groupId,
		boolean retrieveFromCache);

	/**
	* Removes the replicon where uuid = &#63; and groupId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the replicon that was removed
	*/
	public Replicon removeByUUID_G(java.lang.String uuid, long groupId)
		throws NoSuchRepliconException;

	/**
	* Returns the number of replicons where uuid = &#63; and groupId = &#63;.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the number of matching replicons
	*/
	public int countByUUID_G(java.lang.String uuid, long groupId);

	/**
	* Returns all the replicons where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the matching replicons
	*/
	public java.util.List<Replicon> findByUuid_C(java.lang.String uuid,
		long companyId);

	/**
	* Returns a range of all the replicons where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link RepliconModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of replicons
	* @param end the upper bound of the range of replicons (not inclusive)
	* @return the range of matching replicons
	*/
	public java.util.List<Replicon> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end);

	/**
	* Returns an ordered range of all the replicons where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link RepliconModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of replicons
	* @param end the upper bound of the range of replicons (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching replicons
	*/
	public java.util.List<Replicon> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Replicon> orderByComparator);

	/**
	* Returns an ordered range of all the replicons where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link RepliconModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of replicons
	* @param end the upper bound of the range of replicons (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching replicons
	*/
	public java.util.List<Replicon> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Replicon> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first replicon in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching replicon
	* @throws NoSuchRepliconException if a matching replicon could not be found
	*/
	public Replicon findByUuid_C_First(java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Replicon> orderByComparator)
		throws NoSuchRepliconException;

	/**
	* Returns the first replicon in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching replicon, or <code>null</code> if a matching replicon could not be found
	*/
	public Replicon fetchByUuid_C_First(java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Replicon> orderByComparator);

	/**
	* Returns the last replicon in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching replicon
	* @throws NoSuchRepliconException if a matching replicon could not be found
	*/
	public Replicon findByUuid_C_Last(java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Replicon> orderByComparator)
		throws NoSuchRepliconException;

	/**
	* Returns the last replicon in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching replicon, or <code>null</code> if a matching replicon could not be found
	*/
	public Replicon fetchByUuid_C_Last(java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Replicon> orderByComparator);

	/**
	* Returns the replicons before and after the current replicon in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param projectId the primary key of the current replicon
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next replicon
	* @throws NoSuchRepliconException if a replicon with the primary key could not be found
	*/
	public Replicon[] findByUuid_C_PrevAndNext(long projectId,
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Replicon> orderByComparator)
		throws NoSuchRepliconException;

	/**
	* Removes all the replicons where uuid = &#63; and companyId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	*/
	public void removeByUuid_C(java.lang.String uuid, long companyId);

	/**
	* Returns the number of replicons where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the number of matching replicons
	*/
	public int countByUuid_C(java.lang.String uuid, long companyId);

	/**
	* Caches the replicon in the entity cache if it is enabled.
	*
	* @param replicon the replicon
	*/
	public void cacheResult(Replicon replicon);

	/**
	* Caches the replicons in the entity cache if it is enabled.
	*
	* @param replicons the replicons
	*/
	public void cacheResult(java.util.List<Replicon> replicons);

	/**
	* Creates a new replicon with the primary key. Does not add the replicon to the database.
	*
	* @param projectId the primary key for the new replicon
	* @return the new replicon
	*/
	public Replicon create(long projectId);

	/**
	* Removes the replicon with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param projectId the primary key of the replicon
	* @return the replicon that was removed
	* @throws NoSuchRepliconException if a replicon with the primary key could not be found
	*/
	public Replicon remove(long projectId) throws NoSuchRepliconException;

	public Replicon updateImpl(Replicon replicon);

	/**
	* Returns the replicon with the primary key or throws a {@link NoSuchRepliconException} if it could not be found.
	*
	* @param projectId the primary key of the replicon
	* @return the replicon
	* @throws NoSuchRepliconException if a replicon with the primary key could not be found
	*/
	public Replicon findByPrimaryKey(long projectId)
		throws NoSuchRepliconException;

	/**
	* Returns the replicon with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param projectId the primary key of the replicon
	* @return the replicon, or <code>null</code> if a replicon with the primary key could not be found
	*/
	public Replicon fetchByPrimaryKey(long projectId);

	@Override
	public java.util.Map<java.io.Serializable, Replicon> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the replicons.
	*
	* @return the replicons
	*/
	public java.util.List<Replicon> findAll();

	/**
	* Returns a range of all the replicons.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link RepliconModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of replicons
	* @param end the upper bound of the range of replicons (not inclusive)
	* @return the range of replicons
	*/
	public java.util.List<Replicon> findAll(int start, int end);

	/**
	* Returns an ordered range of all the replicons.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link RepliconModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of replicons
	* @param end the upper bound of the range of replicons (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of replicons
	*/
	public java.util.List<Replicon> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Replicon> orderByComparator);

	/**
	* Returns an ordered range of all the replicons.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link RepliconModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of replicons
	* @param end the upper bound of the range of replicons (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of replicons
	*/
	public java.util.List<Replicon> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Replicon> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the replicons from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of replicons.
	*
	* @return the number of replicons
	*/
	public int countAll();

	@Override
	public java.util.Set<java.lang.String> getBadColumnNames();
}