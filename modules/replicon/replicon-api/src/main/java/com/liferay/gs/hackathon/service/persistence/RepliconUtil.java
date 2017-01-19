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

import com.liferay.gs.hackathon.model.Replicon;

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import org.osgi.util.tracker.ServiceTracker;

import java.util.List;

/**
 * The persistence utility for the replicon service. This utility wraps {@link com.liferay.gs.hackathon.service.persistence.impl.RepliconPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see RepliconPersistence
 * @see com.liferay.gs.hackathon.service.persistence.impl.RepliconPersistenceImpl
 * @generated
 */
@ProviderType
public class RepliconUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(Replicon replicon) {
		getPersistence().clearCache(replicon);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<Replicon> findWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Replicon> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Replicon> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<Replicon> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static Replicon update(Replicon replicon) {
		return getPersistence().update(replicon);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static Replicon update(Replicon replicon,
		ServiceContext serviceContext) {
		return getPersistence().update(replicon, serviceContext);
	}

	/**
	* Returns all the replicons where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching replicons
	*/
	public static List<Replicon> findByUuid(java.lang.String uuid) {
		return getPersistence().findByUuid(uuid);
	}

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
	public static List<Replicon> findByUuid(java.lang.String uuid, int start,
		int end) {
		return getPersistence().findByUuid(uuid, start, end);
	}

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
	public static List<Replicon> findByUuid(java.lang.String uuid, int start,
		int end, OrderByComparator<Replicon> orderByComparator) {
		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

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
	public static List<Replicon> findByUuid(java.lang.String uuid, int start,
		int end, OrderByComparator<Replicon> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByUuid(uuid, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first replicon in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching replicon
	* @throws NoSuchRepliconException if a matching replicon could not be found
	*/
	public static Replicon findByUuid_First(java.lang.String uuid,
		OrderByComparator<Replicon> orderByComparator)
		throws com.liferay.gs.hackathon.exception.NoSuchRepliconException {
		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	* Returns the first replicon in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching replicon, or <code>null</code> if a matching replicon could not be found
	*/
	public static Replicon fetchByUuid_First(java.lang.String uuid,
		OrderByComparator<Replicon> orderByComparator) {
		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	* Returns the last replicon in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching replicon
	* @throws NoSuchRepliconException if a matching replicon could not be found
	*/
	public static Replicon findByUuid_Last(java.lang.String uuid,
		OrderByComparator<Replicon> orderByComparator)
		throws com.liferay.gs.hackathon.exception.NoSuchRepliconException {
		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	* Returns the last replicon in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching replicon, or <code>null</code> if a matching replicon could not be found
	*/
	public static Replicon fetchByUuid_Last(java.lang.String uuid,
		OrderByComparator<Replicon> orderByComparator) {
		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	* Returns the replicons before and after the current replicon in the ordered set where uuid = &#63;.
	*
	* @param projectId the primary key of the current replicon
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next replicon
	* @throws NoSuchRepliconException if a replicon with the primary key could not be found
	*/
	public static Replicon[] findByUuid_PrevAndNext(long projectId,
		java.lang.String uuid, OrderByComparator<Replicon> orderByComparator)
		throws com.liferay.gs.hackathon.exception.NoSuchRepliconException {
		return getPersistence()
				   .findByUuid_PrevAndNext(projectId, uuid, orderByComparator);
	}

	/**
	* Removes all the replicons where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	*/
	public static void removeByUuid(java.lang.String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	* Returns the number of replicons where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching replicons
	*/
	public static int countByUuid(java.lang.String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	* Returns the replicon where uuid = &#63; and groupId = &#63; or throws a {@link NoSuchRepliconException} if it could not be found.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching replicon
	* @throws NoSuchRepliconException if a matching replicon could not be found
	*/
	public static Replicon findByUUID_G(java.lang.String uuid, long groupId)
		throws com.liferay.gs.hackathon.exception.NoSuchRepliconException {
		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	* Returns the replicon where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching replicon, or <code>null</code> if a matching replicon could not be found
	*/
	public static Replicon fetchByUUID_G(java.lang.String uuid, long groupId) {
		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	* Returns the replicon where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching replicon, or <code>null</code> if a matching replicon could not be found
	*/
	public static Replicon fetchByUUID_G(java.lang.String uuid, long groupId,
		boolean retrieveFromCache) {
		return getPersistence().fetchByUUID_G(uuid, groupId, retrieveFromCache);
	}

	/**
	* Removes the replicon where uuid = &#63; and groupId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the replicon that was removed
	*/
	public static Replicon removeByUUID_G(java.lang.String uuid, long groupId)
		throws com.liferay.gs.hackathon.exception.NoSuchRepliconException {
		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	* Returns the number of replicons where uuid = &#63; and groupId = &#63;.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the number of matching replicons
	*/
	public static int countByUUID_G(java.lang.String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	* Returns all the replicons where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the matching replicons
	*/
	public static List<Replicon> findByUuid_C(java.lang.String uuid,
		long companyId) {
		return getPersistence().findByUuid_C(uuid, companyId);
	}

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
	public static List<Replicon> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end) {
		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

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
	public static List<Replicon> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		OrderByComparator<Replicon> orderByComparator) {
		return getPersistence()
				   .findByUuid_C(uuid, companyId, start, end, orderByComparator);
	}

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
	public static List<Replicon> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		OrderByComparator<Replicon> orderByComparator, boolean retrieveFromCache) {
		return getPersistence()
				   .findByUuid_C(uuid, companyId, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first replicon in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching replicon
	* @throws NoSuchRepliconException if a matching replicon could not be found
	*/
	public static Replicon findByUuid_C_First(java.lang.String uuid,
		long companyId, OrderByComparator<Replicon> orderByComparator)
		throws com.liferay.gs.hackathon.exception.NoSuchRepliconException {
		return getPersistence()
				   .findByUuid_C_First(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the first replicon in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching replicon, or <code>null</code> if a matching replicon could not be found
	*/
	public static Replicon fetchByUuid_C_First(java.lang.String uuid,
		long companyId, OrderByComparator<Replicon> orderByComparator) {
		return getPersistence()
				   .fetchByUuid_C_First(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the last replicon in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching replicon
	* @throws NoSuchRepliconException if a matching replicon could not be found
	*/
	public static Replicon findByUuid_C_Last(java.lang.String uuid,
		long companyId, OrderByComparator<Replicon> orderByComparator)
		throws com.liferay.gs.hackathon.exception.NoSuchRepliconException {
		return getPersistence()
				   .findByUuid_C_Last(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the last replicon in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching replicon, or <code>null</code> if a matching replicon could not be found
	*/
	public static Replicon fetchByUuid_C_Last(java.lang.String uuid,
		long companyId, OrderByComparator<Replicon> orderByComparator) {
		return getPersistence()
				   .fetchByUuid_C_Last(uuid, companyId, orderByComparator);
	}

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
	public static Replicon[] findByUuid_C_PrevAndNext(long projectId,
		java.lang.String uuid, long companyId,
		OrderByComparator<Replicon> orderByComparator)
		throws com.liferay.gs.hackathon.exception.NoSuchRepliconException {
		return getPersistence()
				   .findByUuid_C_PrevAndNext(projectId, uuid, companyId,
			orderByComparator);
	}

	/**
	* Removes all the replicons where uuid = &#63; and companyId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	*/
	public static void removeByUuid_C(java.lang.String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	* Returns the number of replicons where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the number of matching replicons
	*/
	public static int countByUuid_C(java.lang.String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	* Returns all the replicons where projectName = &#63;.
	*
	* @param projectName the project name
	* @return the matching replicons
	*/
	public static List<Replicon> findByProjectName(java.lang.String projectName) {
		return getPersistence().findByProjectName(projectName);
	}

	/**
	* Returns a range of all the replicons where projectName = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link RepliconModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param projectName the project name
	* @param start the lower bound of the range of replicons
	* @param end the upper bound of the range of replicons (not inclusive)
	* @return the range of matching replicons
	*/
	public static List<Replicon> findByProjectName(
		java.lang.String projectName, int start, int end) {
		return getPersistence().findByProjectName(projectName, start, end);
	}

	/**
	* Returns an ordered range of all the replicons where projectName = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link RepliconModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param projectName the project name
	* @param start the lower bound of the range of replicons
	* @param end the upper bound of the range of replicons (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching replicons
	*/
	public static List<Replicon> findByProjectName(
		java.lang.String projectName, int start, int end,
		OrderByComparator<Replicon> orderByComparator) {
		return getPersistence()
				   .findByProjectName(projectName, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the replicons where projectName = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link RepliconModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param projectName the project name
	* @param start the lower bound of the range of replicons
	* @param end the upper bound of the range of replicons (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching replicons
	*/
	public static List<Replicon> findByProjectName(
		java.lang.String projectName, int start, int end,
		OrderByComparator<Replicon> orderByComparator, boolean retrieveFromCache) {
		return getPersistence()
				   .findByProjectName(projectName, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first replicon in the ordered set where projectName = &#63;.
	*
	* @param projectName the project name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching replicon
	* @throws NoSuchRepliconException if a matching replicon could not be found
	*/
	public static Replicon findByProjectName_First(
		java.lang.String projectName,
		OrderByComparator<Replicon> orderByComparator)
		throws com.liferay.gs.hackathon.exception.NoSuchRepliconException {
		return getPersistence()
				   .findByProjectName_First(projectName, orderByComparator);
	}

	/**
	* Returns the first replicon in the ordered set where projectName = &#63;.
	*
	* @param projectName the project name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching replicon, or <code>null</code> if a matching replicon could not be found
	*/
	public static Replicon fetchByProjectName_First(
		java.lang.String projectName,
		OrderByComparator<Replicon> orderByComparator) {
		return getPersistence()
				   .fetchByProjectName_First(projectName, orderByComparator);
	}

	/**
	* Returns the last replicon in the ordered set where projectName = &#63;.
	*
	* @param projectName the project name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching replicon
	* @throws NoSuchRepliconException if a matching replicon could not be found
	*/
	public static Replicon findByProjectName_Last(
		java.lang.String projectName,
		OrderByComparator<Replicon> orderByComparator)
		throws com.liferay.gs.hackathon.exception.NoSuchRepliconException {
		return getPersistence()
				   .findByProjectName_Last(projectName, orderByComparator);
	}

	/**
	* Returns the last replicon in the ordered set where projectName = &#63;.
	*
	* @param projectName the project name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching replicon, or <code>null</code> if a matching replicon could not be found
	*/
	public static Replicon fetchByProjectName_Last(
		java.lang.String projectName,
		OrderByComparator<Replicon> orderByComparator) {
		return getPersistence()
				   .fetchByProjectName_Last(projectName, orderByComparator);
	}

	/**
	* Returns the replicons before and after the current replicon in the ordered set where projectName = &#63;.
	*
	* @param projectId the primary key of the current replicon
	* @param projectName the project name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next replicon
	* @throws NoSuchRepliconException if a replicon with the primary key could not be found
	*/
	public static Replicon[] findByProjectName_PrevAndNext(long projectId,
		java.lang.String projectName,
		OrderByComparator<Replicon> orderByComparator)
		throws com.liferay.gs.hackathon.exception.NoSuchRepliconException {
		return getPersistence()
				   .findByProjectName_PrevAndNext(projectId, projectName,
			orderByComparator);
	}

	/**
	* Removes all the replicons where projectName = &#63; from the database.
	*
	* @param projectName the project name
	*/
	public static void removeByProjectName(java.lang.String projectName) {
		getPersistence().removeByProjectName(projectName);
	}

	/**
	* Returns the number of replicons where projectName = &#63;.
	*
	* @param projectName the project name
	* @return the number of matching replicons
	*/
	public static int countByProjectName(java.lang.String projectName) {
		return getPersistence().countByProjectName(projectName);
	}

	/**
	* Caches the replicon in the entity cache if it is enabled.
	*
	* @param replicon the replicon
	*/
	public static void cacheResult(Replicon replicon) {
		getPersistence().cacheResult(replicon);
	}

	/**
	* Caches the replicons in the entity cache if it is enabled.
	*
	* @param replicons the replicons
	*/
	public static void cacheResult(List<Replicon> replicons) {
		getPersistence().cacheResult(replicons);
	}

	/**
	* Creates a new replicon with the primary key. Does not add the replicon to the database.
	*
	* @param projectId the primary key for the new replicon
	* @return the new replicon
	*/
	public static Replicon create(long projectId) {
		return getPersistence().create(projectId);
	}

	/**
	* Removes the replicon with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param projectId the primary key of the replicon
	* @return the replicon that was removed
	* @throws NoSuchRepliconException if a replicon with the primary key could not be found
	*/
	public static Replicon remove(long projectId)
		throws com.liferay.gs.hackathon.exception.NoSuchRepliconException {
		return getPersistence().remove(projectId);
	}

	public static Replicon updateImpl(Replicon replicon) {
		return getPersistence().updateImpl(replicon);
	}

	/**
	* Returns the replicon with the primary key or throws a {@link NoSuchRepliconException} if it could not be found.
	*
	* @param projectId the primary key of the replicon
	* @return the replicon
	* @throws NoSuchRepliconException if a replicon with the primary key could not be found
	*/
	public static Replicon findByPrimaryKey(long projectId)
		throws com.liferay.gs.hackathon.exception.NoSuchRepliconException {
		return getPersistence().findByPrimaryKey(projectId);
	}

	/**
	* Returns the replicon with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param projectId the primary key of the replicon
	* @return the replicon, or <code>null</code> if a replicon with the primary key could not be found
	*/
	public static Replicon fetchByPrimaryKey(long projectId) {
		return getPersistence().fetchByPrimaryKey(projectId);
	}

	public static java.util.Map<java.io.Serializable, Replicon> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the replicons.
	*
	* @return the replicons
	*/
	public static List<Replicon> findAll() {
		return getPersistence().findAll();
	}

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
	public static List<Replicon> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

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
	public static List<Replicon> findAll(int start, int end,
		OrderByComparator<Replicon> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

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
	public static List<Replicon> findAll(int start, int end,
		OrderByComparator<Replicon> orderByComparator, boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the replicons from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of replicons.
	*
	* @return the number of replicons
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static java.util.Set<java.lang.String> getBadColumnNames() {
		return getPersistence().getBadColumnNames();
	}

	public static RepliconPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<RepliconPersistence, RepliconPersistence> _serviceTracker =
		ServiceTrackerFactory.open(RepliconPersistence.class);
}