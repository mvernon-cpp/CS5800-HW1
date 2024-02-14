package Q4;

public class Main {
	public static void main(String[] args) throws Exception {
		Folder php_demo1 = new Folder("php_demo1");
		Folder source_files = new Folder("Source Files");
		Folder phalcon = new Folder(".phalcon");
		Folder app = new Folder("app");
		Folder config = new Folder("config");
		Folder controllers = new Folder("controllers");
		Folder library = new Folder("library");
		Folder migrations = new Folder("migrations");
		Folder models = new Folder("models");
		Folder views = new Folder("views");
		Folder cache = new Folder("cache");
		Folder publicFolder = new Folder("public");
		Folder include_path = new Folder("Include Path");
		Folder remote_files = new Folder("Remote Files");

		File htaccess = new File(".htaccess");
		File htrouter = new File(".htrouter.php");
		File index = new File("index.html");

		php_demo1.addFolder(source_files);
		php_demo1.addFolder(include_path);
		php_demo1.addFolder(remote_files);

		source_files.addFolder(phalcon);
		source_files.addFolder(app);
		source_files.addFolder(cache);
		source_files.addFolder(publicFolder);
		source_files.addFile(htaccess);
		source_files.addFile(htrouter);
		source_files.addFile(index);

		app.addFolder(config);
		app.addFolder(controllers);
		app.addFolder(library);
		app.addFolder(migrations);
		app.addFolder(models);
		app.addFolder(views);

		System.out.println("=======File Structure=======\n['+' are folders; '-' are files]\n");
		php_demo1.printSubFolders();

		// php_demo1.print();
		// source_files.print();
		// app.print();
	}
}
