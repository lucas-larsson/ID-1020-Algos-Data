# CMAKE generated file: DO NOT EDIT!
# Generated by "Unix Makefiles" Generator, CMake Version 3.20

# Delete rule output on recipe failure.
.DELETE_ON_ERROR:

#=============================================================================
# Special targets provided by cmake.

# Disable implicit rules so canonical targets will work.
.SUFFIXES:

# Disable VCS-based implicit rules.
% : %,v

# Disable VCS-based implicit rules.
% : RCS/%

# Disable VCS-based implicit rules.
% : RCS/%,v

# Disable VCS-based implicit rules.
% : SCCS/s.%

# Disable VCS-based implicit rules.
% : s.%

.SUFFIXES: .hpux_make_needs_suffix_list

# Command-line flag to silence nested $(MAKE).
$(VERBOSE)MAKESILENT = -s

#Suppress display of executed commands.
$(VERBOSE).SILENT:

# A target that is always out of date.
cmake_force:
.PHONY : cmake_force

#=============================================================================
# Set environment variables for the build.

# The shell in which to execute make rules.
SHELL = /bin/sh

# The CMake executable.
CMAKE_COMMAND = /Applications/CLion.app/Contents/bin/cmake/mac/bin/cmake

# The command to remove a file.
RM = /Applications/CLion.app/Contents/bin/cmake/mac/bin/cmake -E rm -f

# Escaping for special characters.
EQUALS = =

# The top-level source directory on which CMake was run.
CMAKE_SOURCE_DIR = "/Users/lucasmacbookpro/Documents/ID 1020 Algos&Data/lab2/Assignment3"

# The top-level build directory on which CMake was run.
CMAKE_BINARY_DIR = "/Users/lucasmacbookpro/Documents/ID 1020 Algos&Data/lab2/Assignment3/cmake-build-debug"

# Include any dependencies generated for this target.
include CMakeFiles/Assignment3.dir/depend.make
# Include the progress variables for this target.
include CMakeFiles/Assignment3.dir/progress.make

# Include the compile flags for this target's objects.
include CMakeFiles/Assignment3.dir/flags.make

CMakeFiles/Assignment3.dir/main.c.o: CMakeFiles/Assignment3.dir/flags.make
CMakeFiles/Assignment3.dir/main.c.o: ../main.c
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --progress-dir="/Users/lucasmacbookpro/Documents/ID 1020 Algos&Data/lab2/Assignment3/cmake-build-debug/CMakeFiles" --progress-num=$(CMAKE_PROGRESS_1) "Building C object CMakeFiles/Assignment3.dir/main.c.o"
	/Applications/Xcode.app/Contents/Developer/Toolchains/XcodeDefault.xctoolchain/usr/bin/cc $(C_DEFINES) $(C_INCLUDES) $(C_FLAGS) -o CMakeFiles/Assignment3.dir/main.c.o -c "/Users/lucasmacbookpro/Documents/ID 1020 Algos&Data/lab2/Assignment3/main.c"

CMakeFiles/Assignment3.dir/main.c.i: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Preprocessing C source to CMakeFiles/Assignment3.dir/main.c.i"
	/Applications/Xcode.app/Contents/Developer/Toolchains/XcodeDefault.xctoolchain/usr/bin/cc $(C_DEFINES) $(C_INCLUDES) $(C_FLAGS) -E "/Users/lucasmacbookpro/Documents/ID 1020 Algos&Data/lab2/Assignment3/main.c" > CMakeFiles/Assignment3.dir/main.c.i

CMakeFiles/Assignment3.dir/main.c.s: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Compiling C source to assembly CMakeFiles/Assignment3.dir/main.c.s"
	/Applications/Xcode.app/Contents/Developer/Toolchains/XcodeDefault.xctoolchain/usr/bin/cc $(C_DEFINES) $(C_INCLUDES) $(C_FLAGS) -S "/Users/lucasmacbookpro/Documents/ID 1020 Algos&Data/lab2/Assignment3/main.c" -o CMakeFiles/Assignment3.dir/main.c.s

# Object files for target Assignment3
Assignment3_OBJECTS = \
"CMakeFiles/Assignment3.dir/main.c.o"

# External object files for target Assignment3
Assignment3_EXTERNAL_OBJECTS =

Assignment3: CMakeFiles/Assignment3.dir/main.c.o
Assignment3: CMakeFiles/Assignment3.dir/build.make
Assignment3: CMakeFiles/Assignment3.dir/link.txt
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --bold --progress-dir="/Users/lucasmacbookpro/Documents/ID 1020 Algos&Data/lab2/Assignment3/cmake-build-debug/CMakeFiles" --progress-num=$(CMAKE_PROGRESS_2) "Linking C executable Assignment3"
	$(CMAKE_COMMAND) -E cmake_link_script CMakeFiles/Assignment3.dir/link.txt --verbose=$(VERBOSE)

# Rule to build all files generated by this target.
CMakeFiles/Assignment3.dir/build: Assignment3
.PHONY : CMakeFiles/Assignment3.dir/build

CMakeFiles/Assignment3.dir/clean:
	$(CMAKE_COMMAND) -P CMakeFiles/Assignment3.dir/cmake_clean.cmake
.PHONY : CMakeFiles/Assignment3.dir/clean

CMakeFiles/Assignment3.dir/depend:
	cd "/Users/lucasmacbookpro/Documents/ID 1020 Algos&Data/lab2/Assignment3/cmake-build-debug" && $(CMAKE_COMMAND) -E cmake_depends "Unix Makefiles" "/Users/lucasmacbookpro/Documents/ID 1020 Algos&Data/lab2/Assignment3" "/Users/lucasmacbookpro/Documents/ID 1020 Algos&Data/lab2/Assignment3" "/Users/lucasmacbookpro/Documents/ID 1020 Algos&Data/lab2/Assignment3/cmake-build-debug" "/Users/lucasmacbookpro/Documents/ID 1020 Algos&Data/lab2/Assignment3/cmake-build-debug" "/Users/lucasmacbookpro/Documents/ID 1020 Algos&Data/lab2/Assignment3/cmake-build-debug/CMakeFiles/Assignment3.dir/DependInfo.cmake" --color=$(COLOR)
.PHONY : CMakeFiles/Assignment3.dir/depend

