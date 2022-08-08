package com.todos.tests;

import java.io.IOException;

import org.junit.Assert;
import org.testng.annotations.Test;

import com.test.todos.pages.ToDoPage;
import com.test.todos.utility.Setup;

public class AddToDoTests extends Setup {

	public AddToDoTests() throws IOException {
		super();
	}
	
	ToDoPage toDoPage;
	@Test
	public void iCanAddToDo() throws IOException {
		toDoPage = new ToDoPage();
		boolean result1 = toDoPage.isElementDisplayed(ToDoPage.inputText);
		Assert.assertTrue(result1);
		toDoPage.fillToDo(prop.getProperty("toDo1"));
		String txtToDo = toDoPage.checkFieldContains(ToDoPage.textToDos);
		Assert.assertTrue(txtToDo.contains(prop.getProperty("toDo1")));
		boolean result2 = toDoPage.isCheckBoxSelected(ToDoPage.chekBox);
		Assert.assertFalse(result2);
	}
}
