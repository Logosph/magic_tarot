#!/bin/bash

uvicorn app.main:app --port 8001 --host 0.0.0.0 --workers 6 --reload