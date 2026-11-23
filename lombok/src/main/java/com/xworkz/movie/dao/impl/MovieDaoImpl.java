package com.xworkz.movie.dao.impl;

import com.xworkz.movie.dao.MovieDao;
import com.xworkz.movie.dto.MovieDto;

public class MovieDaoImpl implements MovieDao {

    @Override
    public String saveMovie(MovieDto movieDto) {

        System.out.println(movieDto);

        return "Data Saved";
    }
}
