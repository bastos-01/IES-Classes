# LAB 3.3

## Explain the differences between the RestController and Controller components used in this sample.

In th class `IssueController`, which uses `@RestController` annotation, the methods return JSON data. On the other hand, the annotation `@Controller` renders Thymeleaf templates. Also Rest controllers only handle 'GET' requests, when Controller can also handle 'POST'.

# Both the RestController and the Controller need to access the database, using a Repository. How do they get a valid instance of the Repository to work with?

	@AutoWired
	Repository repository;
	
The annotation will search for an instance of the repository and assign it to `repository` variable;

