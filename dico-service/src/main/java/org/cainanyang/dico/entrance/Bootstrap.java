package org.cainanyang.dico.entrance;

import org.cainanyang.dico.domain.Article;
import org.cainanyang.dico.persistence.ArticleDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Bootstrap {
	public static void main(String[] args) {
		System.out.println("start ...");
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		ArticleDao dao = (ArticleDao)context.getBean("articleDao");
		dao.addArticle(1, "we love it.");
		Article a = dao.getArticleById(1);
		System.out.println(a.getTitle());
		System.out.println("done.");
	}
}
