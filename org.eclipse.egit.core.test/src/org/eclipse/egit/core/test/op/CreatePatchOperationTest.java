 * Copyright (c) 2011, Tasktop Technologies
 *
 * Contributors:
 *    Benjamin Muskalla (Tasktop Technologies) - initial implementation
	private static final String SIMPLE_GIT_PATCH_CONTENT = "From 6dcd097c7d39e9ba0b31a380981d3fb46017d6c2 Sat, 23 Jul 2011 20:33:24 -0330\n"
			+ "index e69de29..eb5f2c9 100644\n"
			+ "+another line\n"
			+ "\\ No newline at end of file";
	private static final String SIMPLE_ONELINE_PATCH_CONTENT = "6dcd097c7d39e9ba0b31a380981d3fb46017d6c2 2nd commit\n"
			+ "index e69de29..eb5f2c9 100644\n"
			+ "+another line\n"
			+ "\\ No newline at end of file";
			+ "index e69de29..eb5f2c9 100644\n"
			+ "+another line\n"
			+ "\\ No newline at end of file";
			+ "index 0000000..47d2739\n"
			+ "\\ No newline at end of file\n"
			+ "index e69de29..eb5f2c9 100644\n"
			+ "+another line\n"
			+ "\\ No newline at end of file";
				project.getProject(), file, "another line", "2nd commit");
		assertPatch(SIMPLE_PATCH_CONTENT, patchContent);
				project.getProject(), file, "another line", "2nd commit");
	@Test(expected = IllegalStateException.class)
				project.getProject(), file, "another line", "2nd commit");
				project.getProject(), file, "another line", "2nd commit");
				project.getProject(), file, "another line", "[findBugs] Change visibility of repositoryFile to package");
				project.getProject(), file, "another line", "Add collapse/expand all utility method for tree viewers.");
		testRepository.appendFileContent(newFile, "new content");
		sb.append("index 0000000..47d2739").append("\n");
		sb.append("\\ No newline at end of file").append("\n");
		testRepository.appendFileContent(file, "another line");
		testRepository.appendFileContent(newFile, "new content");
		testRepository.appendFileContent(file, "another line");
		testRepository.appendFileContent(newFile, "new content");