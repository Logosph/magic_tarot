# main.py (агрегатор)
from fastapi import FastAPI
import httpx

app = FastAPI()

MICROSERVICES = {
    "service_a": "http://localhost:8000",
    "service_b": "http://localhost:8001",
}