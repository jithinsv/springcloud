package com.ust.pcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ust.pmodel.PConfigProps;
@RestController
public class MyPController {

	@Autowired
	PConfigProps pConfigProps;
	
	@RequestMapping("/ust/projectDetails")
	public String projectDetails() {
		return "ProjectId is " + pConfigProps.getProjectId() + " ProjectName is "+ pConfigProps.getProjectName()+" ProjectLocation is "+pConfigProps.getProjectLocation()+" ProjectCost is "+pConfigProps.getProjectCost()+" Project Status is "+pConfigProps.getProjectStatus();
	}
}
