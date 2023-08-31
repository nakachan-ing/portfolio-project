INSERT INTO level_types(level_id, level_type)
VALUES(1, '初学者同士の学習アウトプットとして作ってみたい');
INSERT INTO level_types(level_id, level_type)
VALUES(2, '就活・転職のためにポートフォリオをチームで開発したい');
INSERT INTO level_types(level_id, level_type)
VALUES(3, '仲間と一緒にWebサービスを開発したい');

INSERT INTO duration_types(duration_id, duration_type)
VALUES(1, '短期(〜6ヶ月)');
INSERT INTO duration_types(duration_id, duration_type)
VALUES(2, '中期(6ヶ月〜1年)');
INSERT INTO duration_types(duration_id, duration_type)
VALUES(3, '長期(1年以上〜)');

INSERT INTO projects(project_name, detail, level_id, duration_id, p_created_at, p_updated_at)
VALUES('project1', 'detail1', 1, 2, '2023-08-01 13:00:00', '2023-08-01 13:00:00');
INSERT INTO projects(project_name, detail, level_id, duration_id, p_created_at, p_updated_at)
VALUES('project2', 'detail2', 2, 3, '2023-08-02 14:00:00', '2023-08-04 17:15:00');

INSERT INTO comments(project_id, remark, c_created_at)
VALUES(1, 'いいですね', '2023-08-01 13:00:00');
INSERT INTO comments(project_id, remark, c_created_at)
VALUES(1, 'Great!', '2023-08-01 17:00:00');

INSERT INTO language_types(language_type)VALUES('Angular');
INSERT INTO language_types(language_type)VALUES('Vue');
INSERT INTO language_types(language_type)VALUES('Ember');
INSERT INTO language_types(language_type)VALUES('jQuery');
INSERT INTO language_types(language_type)VALUES('React');
INSERT INTO language_types(language_type)VALUES('Svelte');
INSERT INTO language_types(language_type)VALUES('Backbone');
INSERT INTO language_types(language_type)VALUES('Nuxt.js');
INSERT INTO language_types(language_type)VALUES('Next.js');
INSERT INTO language_types(language_type)VALUES('React Native');
INSERT INTO language_types(language_type)VALUES('Java');
INSERT INTO language_types(language_type)VALUES('Ruby');
INSERT INTO language_types(language_type)VALUES('PHP');
INSERT INTO language_types(language_type)VALUES('Python');
INSERT INTO language_types(language_type)VALUES('JavaScript');
INSERT INTO language_types(language_type)VALUES('C#');
INSERT INTO language_types(language_type)VALUES('Perl');
INSERT INTO language_types(language_type)VALUES('C++');
INSERT INTO language_types(language_type)VALUES('Kotlin');
INSERT INTO language_types(language_type)VALUES('Scala');
INSERT INTO language_types(language_type)VALUES('Go');
INSERT INTO language_types(language_type)VALUES('TypeScript');
INSERT INTO language_types(language_type)VALUES('Swift');
INSERT INTO language_types(language_type)VALUES('その他');

INSERT INTO database_types(database_type)VALUES('MySQL');
INSERT INTO database_types(database_type)VALUES('PostgreSQL');
INSERT INTO database_types(database_type)VALUES('MariaDB');
INSERT INTO database_types(database_type)VALUES('SQLite');
INSERT INTO database_types(database_type)VALUES('Microsoft Access');
INSERT INTO database_types(database_type)VALUES('Microsoft SQL Server');
INSERT INTO database_types(database_type)VALUES('Oracle Datebase');
INSERT INTO database_types(database_type)VALUES('Amazon RDS');
INSERT INTO database_types(database_type)VALUES('GCP Cloud SQL');
INSERT INTO database_types(database_type)VALUES('Azure SQL Database');
INSERT INTO database_types(database_type)VALUES('その他');

INSERT INTO infrastructure_types(infrastructure_type)VALUES('Amazon Web Service');
INSERT INTO infrastructure_types(infrastructure_type)VALUES('Google Cloud Platform');
INSERT INTO infrastructure_types(infrastructure_type)VALUES('Microsoft Azure');
INSERT INTO infrastructure_types(infrastructure_type)VALUES('その他');

INSERT INTO framework_types(framework_type)VALUES('Ruby on Rails');
INSERT INTO framework_types(framework_type)VALUES('Spring Boot');
INSERT INTO framework_types(framework_type)VALUES('Play Framework');
INSERT INTO framework_types(framework_type)VALUES('Laravel');
INSERT INTO framework_types(framework_type)VALUES('Flask');
INSERT INTO framework_types(framework_type)VALUES('Django');
INSERT INTO framework_types(framework_type)VALUES('その他');

INSERT INTO management_types(management_type)VALUES('Git');
INSERT INTO management_types(management_type)VALUES('GitHub');
INSERT INTO management_types(management_type)VALUES('GitLab');
INSERT INTO management_types(management_type)VALUES('Bitbucket');
INSERT INTO management_types(management_type)VALUES('その他');

INSERT INTO communication_types(communication_type)VALUES('Asana');
INSERT INTO communication_types(communication_type)VALUES('Trello');
INSERT INTO communication_types(communication_type)VALUES('Slack');
INSERT INTO communication_types(communication_type)VALUES('Notion');
INSERT INTO communication_types(communication_type)VALUES('ChatWork');
INSERT INTO communication_types(communication_type)VALUES('その他');