INSERT INTO service_group (service_group_id, service_group_name) VALUES ('1','ダミーサービスグループ');
INSERT INTO team (team_id,belonging_service_group_id,team_name,team_authority) VALUES ('1','1','ダミーチーム','管理者');
INSERT INTO account (account_id, user_name, age, account_type, belonging_service_group_id, belonging_team_id) VALUES ('dummy','ダミー',30,'ADMIN','1','1');