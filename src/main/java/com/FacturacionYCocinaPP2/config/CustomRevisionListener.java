package com.FacturacionYCocinaPP2.config;

import org.hibernate.envers.RevisionListener;
import com.FacturacionYCocinaPP2.entities.audit.Revision;

public class CustomRevisionListener implements RevisionListener {
	public void newRevision(Object revisionEntity) {final Revision revision = (Revision) revisionEntity;}
}
