package com.xworkz.movie.dto;

import lombok.*;

@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
@Data

public class MovieDto {

    private int id;
    private String movieName;

}