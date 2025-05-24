package _15_2251172299_LuuVanDung_BaiTap5;

import java.util.Objects;

public class Director {
	ShapeBuilder builder;

	void make(String type) {
		builder.reset();
		if(Objects.equals(type, "Type Circle")) {
			builder.buildRadius();
		}
		else if(Objects.equals(type, "Type Rectangle")) {
			builder.buildLength();
			builder.buildWidth();
		}
	}

	Director(ShapeBuilder builder){
		this.builder = builder;
	}

	void changeBuilder(ShapeBuilder builder) {
		this.builder = builder;
	}
}