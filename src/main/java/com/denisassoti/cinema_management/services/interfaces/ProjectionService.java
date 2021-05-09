/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.denisassoti.cinema_management.services.interfaces;

import com.denisassoti.cinema_management.entities.ProjectionFilm;
import java.util.List;

/**
 *
 * @author Denis ASSOTI
 */
public interface ProjectionService {
    List<ProjectionFilm> getAllProjections();
    void saveProjection(ProjectionFilm projectionFilm);
    ProjectionFilm getProjectionById(Long id);
    void deleteProjectionById(Long id);
}
