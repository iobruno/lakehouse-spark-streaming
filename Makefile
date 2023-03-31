.PHONY: setup full-setup minimal-setup fatjar run

setup: minimal-setup

full-setup: fatjar
	@docker-compose -f docker-compose.complex.yml up -d

minimal-setup: fatjar
	@docker-compose -f docker-compose.simple.yml up -d

fatjar:
	@./gradlew clean shadowJar

run: build
	@java --add-exports java.base/sun.nio.ch=ALL-UNNAMED -jar build/libs/*.jar
