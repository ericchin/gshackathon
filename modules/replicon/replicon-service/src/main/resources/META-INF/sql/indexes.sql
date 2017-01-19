create index IX_6B1C4E93 on GS_Replicon (projectName[$COLUMN_LENGTH:75$]);
create index IX_89847335 on GS_Replicon (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_BC8A42F7 on GS_Replicon (uuid_[$COLUMN_LENGTH:75$], groupId);