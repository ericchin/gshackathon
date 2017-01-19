create table GS_Replicon (
	uuid_ VARCHAR(75) null,
	projectId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	projectName VARCHAR(75) null,
	startTime DATE null,
	endTime DATE null,
	billing VARCHAR(75) null,
	activity VARCHAR(75) null
);