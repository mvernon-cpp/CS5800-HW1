package Q4;

import java.util.LinkedList;

public class Folder {
	private String name;
	private LinkedList<Folder> subFolders;
	private LinkedList<File> files;

	public Folder(String name) {
		this.name = name;
		this.subFolders = new LinkedList<>();
		this.files = new LinkedList<>();
	}

	public void deleteFolder(Folder subFolder) {
		subFolder.getSubFolders().clear();
		this.getSubFolders().remove(subFolder);
	}

	public void addFolder(Folder subFolder) {
		this.subFolders.add(subFolder);
	}

	public void addFile(File file) {
		this.files.add(file);
	}

	public LinkedList<Folder> getSubFolders() {
		return subFolders;
	}

	public LinkedList<File> getFiles() {
		return files;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String tabs(int numOfTabs) {
		String output = "";
		for (int i = 0; i < numOfTabs; i++) {
			output += "\t";
		}
		return output;
	}

	public void printSubFolders() {
		System.out.println("\nReading folder: " + this.getName());

		for (Folder folder : getSubFolders()) {
			System.out.println(folder);
			if (folder.getSubFolders().size() > 0) {
				folder.printSubFolders();
			}
		}
		if (this.getFiles().size() > 0) {
			this.getFiles().forEach(System.out::println);
		}
		System.out.println();
	}

	public void print() {
		System.out.println(subFolders);
		// this.getSubFolders().forEach(System.out::println);
		// this.getFiles().forEach(System.out::println);
	}

	@Override
	public String toString() {
		return "\t+" + this.getName();
	}
}
