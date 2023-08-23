INSERT INTO level_types(id, level_type)
VALUES(1, '初学者同士の学習アウトプットとして作ってみたい');
INSERT INTO level_types(id, level_type)
VALUES(2, '就活・転職のためにポートフォリオをチームで開発したい');
INSERT INTO level_types(id, level_type)
VALUES(3, '仲間と一緒にWebサービスを開発したい');

INSERT INTO duration_types(id, duration_type)
VALUES(1, '短期(〜6ヶ月)');
INSERT INTO duration_types(id, duration_type)
VALUES(2, '中期(6ヶ月〜1年)');
INSERT INTO duration_types(id, duration_type)
VALUES(3, '長期(1年以上〜)');

INSERT INTO projects(id, project_name, detail, level_id, duration_id, created_at, updated_at)
VALUES(1, 'project1', 'detail1', 1, 2, '2023-08-01 13:00:00', '2023-08-01 13:00:00');
INSERT INTO projects(id, project_name, detail, level_id, duration_id, created_at, updated_at)
VALUES(2, 'project2', 'detail2', 2, 3, '2023-08-02 14:00:00', '2023-08-04 17:15:00');

INSERT INTO comments(id, project_id, remark)
VALUES(1, 1, 'いいですね');
INSERT INTO comments(id, project_id, remark)
VALUES(2, 1, 'Great!');