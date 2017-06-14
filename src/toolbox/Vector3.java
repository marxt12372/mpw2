package toolbox;

public class Vector3 extends Vector2
{
	protected float _z;

	public Vector3(float x, float y, float z)
	{
		super(x, y);
		_z = z;
	}

	public Vector3()
	{
		super();
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
