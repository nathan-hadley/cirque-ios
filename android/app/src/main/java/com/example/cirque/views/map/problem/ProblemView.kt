package com.example.cirque.views.map.problem

import Problem
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.verticalScroll
import androidx.compose.foundation.rememberScrollState
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.LiveData
import com.example.cirque.views.InfoView
import com.example.cirque.views.map.problem.topo.TopoView

@Composable
fun ProblemView(problem: LiveData<Problem?>) {
    Box(modifier = Modifier.fillMaxSize()) {
        Column(
            modifier = Modifier.verticalScroll(rememberScrollState()),
            horizontalAlignment = Alignment.Start,
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            problem.value?.let {
                TopoView(problem = it)
                InfoView(problem = it)
            }
        }
    }
}