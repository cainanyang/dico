package org.cainanyang.dico.persistence;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import org.cainanyang.dico.domain.Article;
import org.springframework.jdbc.core.simple.ParameterizedRowMapper;
import org.springframework.jdbc.core.simple.SimpleJdbcDaoSupport;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class ArticleDao extends SimpleJdbcDaoSupport {
	public Article getArticleById(int id) {	
		return getSimpleJdbcTemplate().queryForObject(
				"select id, title from articles where id = ? limit 1",
				new ParameterizedRowMapper<Article>() {

					@Override
					public Article mapRow(ResultSet rs, int rowNum)
							throws SQLException {
						Article a = new Article();
						a.setId(rs.getInt(1));
						a.setTitle(rs.getString(2));
						return a;
					}
					
				}, id);
	}
	
	
	public void addArticle(int id, String title) {
		getSimpleJdbcTemplate().update("insert into articles(id, title) values(?, ?)",
				id, title);
	}
	
	public void reinitTable() {
		getSimpleJdbcTemplate().update("drop table if exists articles; create table articles(id int, title varchar); ");
	}
}
