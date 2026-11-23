package com.xworkz.movie;

import com.xworkz.movie.dao.MovieDao;
import com.xworkz.movie.dao.impl.MovieDaoImpl;
import com.xworkz.movie.dto.MovieDto;

public class MovieRunner {

    public static void main(String[] args) {

        MovieDto movieDto = new MovieDto();

        MovieDao movieDao = new MovieDaoImpl();
        movieDto.setId(1);
        movieDto.setMovieName("xxx");
        String saveMovie = movieDao.saveMovie(movieDto);
        System.out.println(saveMovie);
    }
}