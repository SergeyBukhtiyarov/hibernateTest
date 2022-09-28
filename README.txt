Create DB hibernate and admin user in postgres:

mac: download Postgres.App

1) psql   -> open postgres command line
2) CREATE DATABASE "hibernate" WITH OWNER=postgres;
3) CREATE USER "admin" WITH PASSWORD 'admin';
4) GRANT ALL PRIVILEGES ON DATABASE hibernate TO admin;
5) \l
   \du  -> list of all existing db and users, just created 'admin' & 'hibernate' should appear here
   \dt  -> list of all tables in selected db

=========================================================================================

