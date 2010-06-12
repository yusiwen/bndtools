package bndtools.model.repo;

import aQute.bnd.build.Project;

public class ProjectBundle {
	private final Project project;
	private final String bsn;

	ProjectBundle(Project project, String bsn) {
		this.project = project;
		this.bsn = bsn;
	}
	public Project getProject() {
		return project;
	}
	public String getBsn() {
		return bsn;
	}
	@Override
	public String toString() {
		return "ProjectBundle [project=" + project + ", bsn=" + bsn + "]";
	}
}