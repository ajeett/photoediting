using ReactNative.Bridge;
using System;
using System.Collections.Generic;
using Windows.ApplicationModel.Core;
using Windows.UI.Core;

namespace Photo.Editing.Library.RNPhotoEditingLibrary
{
    /// <summary>
    /// A module that allows JS to share data.
    /// </summary>
    class RNPhotoEditingLibraryModule : NativeModuleBase
    {
        /// <summary>
        /// Instantiates the <see cref="RNPhotoEditingLibraryModule"/>.
        /// </summary>
        internal RNPhotoEditingLibraryModule()
        {

        }

        /// <summary>
        /// The name of the native module.
        /// </summary>
        public override string Name
        {
            get
            {
                return "RNPhotoEditingLibrary";
            }
        }
    }
}
