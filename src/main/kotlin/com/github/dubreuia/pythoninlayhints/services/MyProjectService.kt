package com.github.dubreuia.pythoninlayhints.services

import com.github.dubreuia.pythoninlayhints.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
