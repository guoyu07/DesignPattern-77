package io.github.xeyez.designpattern.abstractfactory;

import io.github.xeyez.designpattern.abstractfactory.factory.ComponentLink;
import io.github.xeyez.designpattern.abstractfactory.factory.ComponentPage;
import io.github.xeyez.designpattern.abstractfactory.factory.ComponentTray;
import io.github.xeyez.designpattern.abstractfactory.factory.Factory;

public class Main {
	public static void main(String[] args) {
		//String className = "io.github.xeyez.designpattern.abstractfactory.listfactory.ListFactory";
		String className = "io.github.xeyez.designpattern.abstractfactory.tablefactory.TableFactory";
		
		/* Reflection을 이용하여 Class 동적 Loading */
		Factory factory = Factory.getFactory(className);
		
		ComponentLink joins = factory.createLink("중앙일보", "http://www.joins.com");
		ComponentLink chosun = factory.createLink("조선일보", "http://www.chosun.com");
		
		ComponentLink google = factory.createLink("Google", "http://www.google.com");
		ComponentLink naver = factory.createLink("Naver", "http://www.naver.com");
		ComponentLink daum = factory.createLink("Daum", "http://www.daum.net");
		
		
		ComponentTray trayNews = factory.createTray("신문");
		trayNews.add(joins);
		trayNews.add(chosun);
		
		ComponentTray traySearch = factory.createTray("검색 엔진");
		traySearch.add(google);
		traySearch.add(naver);
		traySearch.add(daum);
		
		
		ComponentPage page = factory.createPage("HtmlPage", "xeyez");
		page.add(trayNews);
		page.add(traySearch);
		
		
		page.output();
	}
}
