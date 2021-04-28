package homeworkWeek2;

public class CategoryManager {
	public void addCategory(Category category) {
		System.out.println("Category Added: "+category.name);
	}
	public void removeCategory(Category category) {
		System.out.println("Category Removed: "+category.name);
	}
	public void updateCategory(Category category) {
		System.out.println("Category Updated: "+category.name);
		
	}

}
