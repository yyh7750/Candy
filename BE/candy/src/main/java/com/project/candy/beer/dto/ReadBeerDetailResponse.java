package com.project.candy.beer.dto;

import com.project.candy.beer.entity.Beer;
import com.project.candy.country.dto.ReadCountryResponse;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * packageName    : com.project.candy.beer.dto
 * fileName       : ReadBeerDetailResponse
 * date           : 2023-03-21
 * description    :
 */
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
public class ReadBeerDetailResponse {

  private long beerId;

  private String beerKrName;

  private String beerEnName;

  private String countryKrName;

  private String countryEnName;

  private String style;

  private double abv;

  private double aroma;

  private double mouthfeel;

  private double flavor;

  private double appearance;

  private double overall;

  private String beerImageUrl;

  private boolean isDrink;

  private boolean isLike;

  public static ReadBeerDetailResponse entityToDTO(Beer beer, ReadCountryResponse readCountryResponse) {
    return ReadBeerDetailResponse.builder()
            .beerId(beer.getId())
            .abv(beer.getAbv())
            .appearance(beer.getAppearance())
            .aroma(beer.getAroma())
            .flavor(beer.getFlavor())
            .mouthfeel(beer.getMouthfeel())
            .overall(beer.getOverall() / 4.0)
            .beerKrName(beer.getBeerKrName())
            .beerEnName(beer.getBeerEnName())
            .style(beer.getStyle())
            .beerImageUrl(beer.getBeerImage())
            .countryKrName(readCountryResponse.getCountryKrName())
            .countryEnName(readCountryResponse.getCountryEnName())
            .build();
  }

  public void setDrinkAndLike(boolean isDrink, boolean isLike) {
    this.isDrink = isDrink;
    this.isLike = isLike;
  }
}
