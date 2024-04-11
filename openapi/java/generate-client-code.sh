#!/bin/bash

# Execute this script from inside the openapi folder

SPEC_FILE=ziqni-webhook-api.yml
CONF_FILE=ziqni-webhook-api.config.yml
GEN_DIR=generated



if [[ -d $GEN_DIR ]]; then
    echo "$GEN_DIR exists."
    rm -rf ./generated
    echo "$GEN_DIR deleted."
    mkdir generated
    echo "$GEN_DIR created."
    openapi-generator-cli  generate -g java -i $SPEC_FILE -c $CONF_FILE -o ./generated --additional-properties=asyncNative=true --additional-properties=library=native -t templates

    # Copy the updated docs
    rm -rf ../docs
    mkdir ../docs
    cp -v ./generated/docs/* ../docs/

    # Copy the new sources
    cp -rf ./generated/src/main/java ./generated/

    else
      mkdir $GEN_DIR
      echo Directory "$GEN_DIR" not found
fi