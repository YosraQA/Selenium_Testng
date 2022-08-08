package com.todos.tests;

import java.io.IOException;

import org.junit.Assert;
import org.testng.annotations.Test;

import com.test.todos.pages.ToDoPage;
import com.test.todos.utility.Setup;

public class RemoveToDoTest extends Setup {

	public RemoveToDoTest() throws IOException {
		super();
	}

	ToDoPage toDoPage;

	@Test
	public void iCanRemoveToDoTest() throws IOException {
		toDoPage = new ToDoPage();
		String txt_SourcePage = toDoPage.verifyTextOnPageSource();
		Assert.assertFalse(txt_SourcePage.contains(prop.getProperty("toDo1")));
	}
}
