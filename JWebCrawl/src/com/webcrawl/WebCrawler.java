package com.webcrawl;

import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.jsoup.nodes.Document;

/**
 * 
 * @author XinQuan
 *	Crawls the web using the links saved in a file.
 */
public class WebCrawler {
	
	public static final String DEFAULT_DIR = System.getProperty("user.dir");
	public static final String FILE_SEPARATOR = FileSystems.getDefault().getSeparator();
	private String crawlPath;
	private String savePath;
	
	public WebCrawler(String filePathToLinks, String savePath) {
		this.savePath = filePathToLinks;
		this.crawlPath = crawlPath;
		//check validity of paths
		if(Files.exists(Paths.get(crawlPath))) {
			
		}
		if(Files.exists(Paths.get(savePath))) {
			System.out.println(System.getProperty("user.home"));
		}
	}
	
	public void crawl() {
		
	}
	
	public static void main(String[] args) {
		new WebCrawler("", "").crawl();
	}
}