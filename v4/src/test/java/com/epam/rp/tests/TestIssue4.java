package com.epam.rp.tests;

import com.epam.reportportal.junit.ReportPortalListener;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.JUnitCore;

public class TestIssue4 {

	@Test
	public void test1() {
		Assert.assertTrue("First result", true);
	}

	@Test
	public void test2() {
		Assert.assertTrue("Second result", true);
	}
}
