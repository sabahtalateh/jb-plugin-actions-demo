package com.github.sabahtalateh.jbpluginactionsdemo.services

import com.github.sabahtalateh.jbpluginactionsdemo.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
