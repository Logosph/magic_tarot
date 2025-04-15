import uvicorn
from fastapi import FastAPI, APIRouter

from app.router import auth_router

app = FastAPI(title='pcm_api', root_path='/api/auth')

ping_router = APIRouter()

@ping_router.get('/ping')
async def ping():
    return {'ping': 'pong'}

app.include_router(ping_router)
app.include_router(auth_router)


if __name__ == '__main__':
    uvicorn.run(app, host='0.0.0.0', port=8000)
