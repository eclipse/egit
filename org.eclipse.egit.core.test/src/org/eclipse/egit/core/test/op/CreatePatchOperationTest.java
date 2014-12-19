 * Copyright (c) 2011, 2014 Tasktop Technologies and others.
	private static final String SIMPLE_GIT_PATCH_CONTENT = "From ca644a113ac60405e54731330be7879f6a36199c Sat, 23 Jul 2011 20:33:24 -0330\n"
			+ "index e69de29..af28d38 100644\n"
			+ "+another line\n";
	private static final String SIMPLE_ONELINE_PATCH_CONTENT = "ca644a113ac60405e54731330be7879f6a36199c 2nd commit\n"
			+ "index e69de29..af28d38 100644\n"
			+ "+another line\n";
			+ "index e69de29..af28d38 100644\n"
			+ "+another line\n";
			+ "index 0000000..b66ba06\n"
			+ "index e69de29..af28d38 100644\n"
			+ "+another line\n";
				project.getProject(), file, "another line\n", "2nd commit");
				project.getProject(), file, "another line\n", "2nd commit");
	public void testSimplePatchNoNewlineAtEnd() throws Exception {
		operation.setHeaderFormat(DiffHeaderFormat.NONE);
		operation.execute(new NullProgressMonitor());

		String patchContent = operation.getPatchContent();
		assertNotNull(patchContent);
		assertPatch(SIMPLE_PATCH_CONTENT.replace("af28d38", "eb5f2c9")
				+ "\\ No newline at end of file\n",
				patchContent);
	}

	@Test
	public void testOnelineHeaderPatch() throws Exception {
		RevCommit secondCommit = testRepository.appendContentAndCommit(
				project.getProject(), file, "another line\n", "2nd commit");

		CreatePatchOperation operation = new CreatePatchOperation(
				testRepository.getRepository(), secondCommit);

	@Test
		operation.setHeaderFormat(DiffHeaderFormat.ONELINE);
		String patchContent = operation.getPatchContent();
		assertPatch("5d67e6eaa2464d15c4216a93a0e7180ec905a2bb new file\n"
				+ "diff --git a/test-file b/test-file\n"
				+ "new file mode 100644\nindex 0000000..e69de29\n"
				+ "--- /dev/null\n" + "+++ b/test-file\n", patchContent);
	@SuppressWarnings("unused")
	@SuppressWarnings("unused")
				project.getProject(), file, "another line\n", "2nd commit");
				project.getProject(), file, "another line\n", "2nd commit");
project.getProject(),
				file, "another line\n",
				"[findBugs] Change visibility of repositoryFile to package");
project.getProject(),
				file, "another line\n",
				"Add collapse/expand all utility method for tree viewers.");
		testRepository.appendFileContent(newFile, "new content\n");
		sb.append("index 0000000..b66ba06").append("\n");
		testRepository.appendFileContent(file, "another line\n");
		testRepository.appendFileContent(newFile, "new content\n");
		testRepository.appendFileContent(file, "another line\n");
		testRepository.appendFileContent(newFile, "new content\n");