from fastapi import APIRouter

from app.schemas import RegisterSchemaIn

auth_router = APIRouter()

@auth_router.post('/signup')
async def signup(
        data: RegisterSchemaIn
):
    return {'signup': 'success'}