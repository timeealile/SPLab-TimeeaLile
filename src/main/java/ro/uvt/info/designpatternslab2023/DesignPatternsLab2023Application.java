package ro.uvt.info.designpatternslab2023;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import ro.uvt.info.designpatternslab2023.classes.*;
import ro.uvt.info.designpatternslab2023.services.BookSaveVisitor;
import ro.uvt.info.designpatternslab2023.services.BookStatistics;
import ro.uvt.info.designpatternslab2023.services.RenderContentVisitor;
import ro.uvt.info.designpatternslab2023.services.TableOfContentUpdate;


@SpringBootApplication
public class DesignPatternsLab2023Application {

	public static void main(String[] args) {
		SpringApplication.run(DesignPatternsLab2023Application.class, args);
	}
}