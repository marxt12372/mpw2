package toolbox;

public class Vector3 extends Vector2
{
	private float _z;

	public Vector3(float x, float y, float z)
	{
		_z = z;
	}

	public Vector3()
	{
	}

	public float getZ()
	{
		return _z;
	}

	public void setZ(float z)
	{
		_z = z;
	}
}
