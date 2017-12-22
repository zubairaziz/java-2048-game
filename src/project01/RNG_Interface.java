/*
 * Author: Zubair Ab Aziz
 * Email: zabaziz@u.rochester.edu
 * Phone: (585) 284-1150
 * Assignment: Project01
 * Lab Section: MW, 1525-1640
 * Collaboration: I did not collaborate with anyone
 */

package project01;

public interface RNG_Interface {
	public void setSeed(long seed);

	public int rand(int max);

	public int rand(int min, int max);
}
