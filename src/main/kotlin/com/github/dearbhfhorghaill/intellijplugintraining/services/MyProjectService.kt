package com.github.dearbhfhorghaill.intellijplugintraining.services

import com.intellij.openapi.project.Project
import com.github.dearbhfhorghaill.intellijplugintraining.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
